import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SUPERDUPERAPPLICATION");


        JPanel panel = new JPanel();
        frame.add(panel);
        JButton button0 = new JButton("Load");
        JButton button1 = new JButton("Save");
//        JButton button2 = new JButton("Clear doc");
        panel.add(button0);
        panel.add(button1);
//        panel.add(button2);
        final JTextField tfFirstName = new JTextField();
        tfFirstName.setPreferredSize(new Dimension(400, 25));
        tfFirstName.setName("Name");
        final JTextField tfSecondName = new JTextField();
        tfSecondName.setPreferredSize(new Dimension(400, 25));
        final JTextField tfAge = new JTextField();
        tfAge.setPreferredSize(new Dimension(400, 25));
        final JTextField tfSalary = new JTextField();
        tfSalary.setPreferredSize(new Dimension(400, 25));


//        final JTextArea textArea = new JTextArea();
//        textArea.setText("\n");
//        final JTextArea textArea1 = new JTextArea();
//        textArea1.setText("\n");
//        panel.add(textArea);
//        panel.add(textArea1);
//
//        JScrollPane areaScrollPane = new JScrollPane(textArea);
//        areaScrollPane.setVerticalScrollBarPolicy(
//                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//        areaScrollPane.setPreferredSize(new Dimension(400, 300));
//
//        JScrollPane areaScrollPane1 = new JScrollPane(textArea1);
//        areaScrollPane1.setVerticalScrollBarPolicy(
//                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//        areaScrollPane1.setPreferredSize(new Dimension(1280, 100));
//
        panel.add(tfFirstName);
        panel.add(tfSecondName);
        panel.add(tfAge);
        panel.add(tfSalary);
//        panel.add(areaScrollPane);

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                JPanel panel = new JPanel();
//                Object[][] data = {{"1", "1", "1","1"}};
//                for (int i = 0; i < ReadandWrite.getStrings().size(); i++) {
//                    String[] str1 =  ReadandWrite.getStrings().get(i).split(":");
//                    for (int j = 0; j < str1.length; j++) {
//                        data[i][j] = str1[j];
//                    }
//
//                }
                JTable table = new JTable(new TableModel() {
                    @Override
                    public int getRowCount() {
                        int result = ReadandWrite.getStrings().size();
                        return result;
                    }

                    @Override
                    public int getColumnCount() {
                        int result = 4;
                        return result;
                    }

                    @Override
                    public String getColumnName(int columnIndex) {
                        String[] names = {"Name", "Second Name", "Age", "Salary"};
                        String result = names[columnIndex];
                        return null;
                    }

                    @Override
                    public Class<?> getColumnClass(int columnIndex) {

                        return String.class;
                    }

                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return false;
                    }

                    @Override
                    public Object getValueAt(int rowIndex, int columnIndex) {
                        ArrayList<String> str = ReadandWrite.getStrings();
                        String result;
                        String[] str0 = str.get(rowIndex).split(":");
                        result = str0[columnIndex];

//
                        return result;
                    }

                    @Override
                    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

                    }

                    @Override
                    public void addTableModelListener(TableModelListener l) {

                    }

                    @Override
                    public void removeTableModelListener(TableModelListener l) {

                    }
                }

                );
                JScrollPane areaScrollPane = new JScrollPane(table);
                areaScrollPane.setVerticalScrollBarPolicy(
                        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                areaScrollPane.setPreferredSize(new

                        Dimension(400, 300)

                );
                frame.add(panel);
                panel.add(areaScrollPane);
                frame.setVisible(true);
                frame.setSize(500, 500);
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);


            }
        }

        );
        button1.addActionListener(new

                                          ActionListener() {
                                              @Override

                                              public void actionPerformed(ActionEvent e) {
                                                  String str1 = tfFirstName.getText() + ":" + tfSecondName.getText() + ":" + tfAge.getText()
                                                          + ":" + tfSalary.getText();

                                                  ReadandWrite.addStrings(str1, true);

//
//                tfFirstName.setText("");
//                tfSecondName.setText("");
//                tfAge.setText("");
//                tfSalary.setText("");
//                textArea.setText("");
//                for (int i = 0; i < ReadandWrite.getStrings().size(); i++) {
//                    String[] str2 =  ReadandWrite.getStrings().get(i).split(":");
//                    for (int j = 0; j < str2.length; j++) {
//                        textArea.append(str2[j] + " ");
//                    }
//                    textArea.append("\n");
//                }
                                              }
                                          }

        );
//        button2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                ReadandWrite.addStrings("", false);
//            }
//        });
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
