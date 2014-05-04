import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

public class Mapper implements DataMapper {

    public static final String DATA_EXT = ".data";
    public static final String CONF_EXT = ".conf";
    String directory;
    String configDirectory;
    String counters;

    public Mapper() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("config.txt"));
        this.directory = props.getProperty("directory");
        this.configDirectory = props.getProperty("configDirectory");
        this.counters = props.getProperty("counters");
    }


    private File getConfFile(Object obj) throws DataMapperException {
        File configFolder = new File(configDirectory);
        File[] configFiles = configFolder.listFiles();
        for (File file : configFiles) {
            if (file.getName().equals(obj.getClass().getSimpleName() + CONF_EXT)) {
                return file;
            } else {
                File confFile = new File(configDirectory + obj.getClass().getSimpleName() + CONF_EXT);
                try {
                    confFile.createNewFile();
                } catch (IOException e) {
                    throw new DataMapperException();
                }
                return confFile;
            }
        }

        return null;
    }

    private File getDataFile(Object obj) throws DataMapperException {
        File dataFolder = new File(directory);
        File[] dataFiles = dataFolder.listFiles();
        if (dataFiles.length == 0) {
            File dataFile = new File(directory + obj.getClass().getSimpleName() + DATA_EXT);
            try {
                dataFile.createNewFile();
            } catch (IOException e) {
                throw new DataMapperException();
            }
        } else {
            for (File file : dataFiles) {
                if (file.getName().equals(obj.getClass().getSimpleName())) {
                    return file;
                } else {
                    File dataFile = new File(directory + obj.getClass().getSimpleName() + DATA_EXT);
                    try {
                        dataFile.createNewFile();
                    } catch (IOException e) {
                        throw new DataMapperException();
                    }
                    return dataFile;
                }
            }

        }
        return null;
    }

    private int getLastCounter(Object obj) throws DataMapperException{
        try {
            Scanner scanCounters = new Scanner(new FileReader(counters));
            while (scanCounters.hasNextLine()){
                String line = scanCounters.nextLine();
                if (line.startsWith(obj.getClass().getSimpleName())){
                    String[] str = line.split(":");
                    return Integer.parseInt(str[1]);
                }
            }
        } catch (FileNotFoundException e) {
            throw new DataMapperException();
        }
        return 0;
    }

    private void incrementCounter(Object obj)throws DataMapperException{
        try {
            Scanner scanCounters = new Scanner(new FileReader(counters));
            while (scanCounters.hasNextLine()){
                String line = scanCounters.nextLine();
                if (line.startsWith(obj.getClass().getSimpleName())){
                    String[] str = line.split(":");
                    int y = Integer.parseInt(str[1]);
                    //TODO finalize counters incrementation
                }
            }
        } catch (FileNotFoundException e) {
            throw new DataMapperException();
        }
    }

    public void save(Object obj) throws DataMapperException {

        File dataFile = getDataFile(obj);
        File confFile = getConfFile(obj);
        int counter = getLastCounter(obj);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(dataFile, true);
            fileWriter.write("ID" + (counter + 1));
            Scanner scanner = new Scanner(confFile);
            ArrayList<String> arr = new ArrayList<>();
            while (scanner.hasNextLine()) {
                arr.add(scanner.nextLine());
            }
            for (String str : arr) {
                Field fld = obj.getClass().getDeclaredField(str);
                fld.setAccessible(true);
                fileWriter.write(":" + fld.get(obj));
            }
            fileWriter.write("\n");
            fileWriter.close();
        } catch (IOException e) {
            throw  new DataMapperException();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        incrementCounter(obj);

    }


    public Object load(long id, Class clazz) {
        return null;
    }


    public Object loadAll(Class clazz) {
        return null;
    }


    public void update(long id, Object obj) {

    }
}
