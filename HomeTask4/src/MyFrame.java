import javafx.scene.control.Cell;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class MyFrame {

    public static void MyFrame() {
        JFrame frame = new JFrame("Internet Shop");
        JPanel panel = new JPanel();
        panel.setLayout(new SpringLayout());

//        JTextField tfFirstName = new JTextField();
//        JLabel l0 = new JLabel("FirstName", JLabel.TRAILING);
//        JTextField tfSecondName = new JTextField();
//        JLabel l1 = new JLabel("SecondName", JLabel.TRAILING);
//        JTextField tfSalary = new JTextField();
//        JLabel l2 = new JLabel("Age", JLabel.TRAILING);
//        JTextField tfAge = new JTextField();
//        JLabel l4 = new JLabel("Salary", JLabel.TRAILING);
//
//        panel.add(l0);
//        panel.add(tfFirstName);
//
//        panel.add(l1);
//        panel.add(tfSecondName);
//
//        panel.add(l2);
//        panel.add(tfSalary);
//
//        panel.add(l4);
//        panel.add(tfAge);


//        SpringUtilities.makeCompactGrid(panel,
//                4, 2,   //rows, cols
//                4, 4,        //initX, initY
//                4, 4);       //xPad, yPad


        JPanel panel1 = new JPanel();
        JButton button0 = new JButton("MyBasket");
        button0.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("GET INFORMATION FROM FILE BASKET TXT");
            }

        });

        panel1.add(button0);
        JButton button1 = new JButton("Browse Store");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame();
                JPanel panel = new JPanel();



                final ArrayList<Good> nodes = new ArrayList<Good>();


                try {
                    ArrayList<Good> temp1 = Database1.createConnection("Notebooks");
                    for (int i = 0; i < temp1.size(); i++) {
                        nodes.add(temp1.get(i));
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                try {
                    ArrayList<Good> temp2 = Database1.createConnection("Cellphones");
                    for (int i = 0; i < temp2.size(); i++) {
                        nodes.add(temp2.get(i));
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                try {
                    ArrayList<Good> temp3 = Database1.createConnection("Printers");
                    for (int i = 0; i < temp3.size(); i++) {
                        nodes.add(temp3.get(i));
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }


                JTable table = new JTable(new TableModel() {
                    @Override
                    public int getRowCount() {

                        return nodes.size();
                    }

                    @Override
                    public int getColumnCount() {
                        return 14;
                    }

                    @Override
                    public String getColumnName(int columnIndex) {
                        String[] columses = {"Good", "ID", "Model", "Manufact.", "Weight", "Cost", "Type", "OS", "RAM", "color", "Size", "Diagonal", "Wi-Fi", "Video"};

                        return columses[columnIndex];
                    }

                    @Override
                    public Class<?> getColumnClass(int columnIndex) {
                        return Good.class;
                    }

                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return false;
                    }

                    @Override
                    public Object getValueAt(int rowIndex, int columnIndex) {
                        Good k = nodes.get(rowIndex);
                        if (k instanceof Printer) {
                            if(columnIndex == 0){
                                return "Printer";
                            }else if (columnIndex == 1) {
                                return k.getGoodid();
                            } else if (columnIndex == 2) {
                                return k.getModel();
                            } else if (columnIndex == 3) {
                                return k.getManufacturer();
                            } else if (columnIndex == 4) {
                                return k.getWeight();
                            } else if (columnIndex == 5) {
                                return k.getCost();
                            } else if (columnIndex == 6) {
                                return ((Printer) k).getType();
                            } else if (columnIndex == 7) {
                                return null;
                            } else if (columnIndex == 8) {
                                return null;
                            } else if (columnIndex == 9) {
                                return ((Printer) k).getColor();
                            } else if (columnIndex == 10) {
                                return null;
                            } else if (columnIndex == 11) {
                                return null;
                            } else if (columnIndex == 12) {
                                return null;
                            } else if (columnIndex == 13) {
                                return null;
                            }
                        }
                            else if (k instanceof Notebook) {
                                if(columnIndex == 0){
                                    return "Notebook";
                                }else if (columnIndex == 1) {
                                    return k.getGoodid();
                                } else if (columnIndex == 2) {
                                    return k.getModel();
                                } else if (columnIndex == 3) {
                                    return k.getManufacturer();
                                } else if (columnIndex == 4) {
                                    return k.getWeight();
                                } else if (columnIndex == 5) {
                                    return k.getCost();
                                } else if (columnIndex == 6) {
                                    return ((Notebook) k).getType();
                                } else if (columnIndex == 7) {
                                    return ((Notebook) k).getOs();
                                } else if (columnIndex == 8) {
                                    return null;
                                } else if (columnIndex == 9) {
                                    return null;
                                } else if (columnIndex == 10) {
                                    return ((Notebook) k).getSize();
                                } else if (columnIndex == 11) {
                                    return null;
                                } else if (columnIndex == 12) {
                                    return ((Notebook) k).isWifi();
                                } else if (columnIndex == 13) {
                                    return null;
                                }
                            }
                         else if (k instanceof Cellphone) {
                            if(columnIndex == 0){
                                return "Cellphone";
                            }else if (columnIndex == 1) {
                                return k.getGoodid();
                            } else if (columnIndex == 2) {
                                return k.getModel();
                            } else if (columnIndex == 3) {
                                return k.getManufacturer();
                            } else if (columnIndex == 4) {
                                return k.getWeight();
                            } else if (columnIndex == 5) {
                                return k.getCost();
                            } else if (columnIndex == 6) {
                                return null;
                            } else if (columnIndex == 7) {
                                return ((Cellphone) k).getOs();
                            } else if (columnIndex == 8) {
                                return ((Cellphone) k).getRam();
                            } else if (columnIndex == 9) {
                                return null;
                            } else if (columnIndex == 10) {
                                return null;
                            } else if (columnIndex == 11) {
                                return ((Cellphone) k).getDiagonal();
                            } else if (columnIndex == 12) {
                                return null;
                            } else if (columnIndex == 13) {
                                return ((Cellphone) k).isVideo();
                            }
                        }
                        return null;

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
                });
                JScrollPane areaScrollPane = new JScrollPane(table);
                areaScrollPane.setVerticalScrollBarPolicy(
                        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                areaScrollPane.setHorizontalScrollBarPolicy(
                        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
                areaScrollPane.setPreferredSize(new

                        Dimension(1500, 500)

                );



                frame.add(panel);
                panel.add(areaScrollPane);
                frame.setSize(1500, 500);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);


            }
        });
        panel1.add(button1, BorderLayout.EAST);

        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.add(panel1, BorderLayout.PAGE_END);
        frame.setVisible(true);
        frame.setSize(300, 200);
        frame.setLocation(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}


class SpringUtilities {
    /**
     * A debugging utility that prints to stdout the component's
     * minimum, preferred, and maximum sizes.
     */
    public static void printSizes(Component c) {
        System.out.println("minimumSize = " + c.getMinimumSize());
        System.out.println("preferredSize = " + c.getPreferredSize());
        System.out.println("maximumSize = " + c.getMaximumSize());
    }

    /**
     * Aligns the first <code>rows</code> * <code>cols</code>
     * components of <code>parent</code> in
     * a grid. Each component is as big as the maximum
     * preferred width and height of the components.
     * The parent is made just big enough to fit them all.
     *
     * @param rows     number of rows
     * @param cols     number of columns
     * @param initialX x location to start the grid at
     * @param initialY y location to start the grid at
     * @param xPad     x padding between cells
     * @param yPad     y padding between cells
     */
    public static void makeGrid(Container parent,
                                int rows, int cols,
                                int initialX, int initialY,
                                int xPad, int yPad) {
        SpringLayout layout;
        try {
            layout = (SpringLayout) parent.getLayout();
        } catch (ClassCastException exc) {
            System.err.println("The first argument to makeGrid must use SpringLayout.");
            return;
        }

        Spring xPadSpring = Spring.constant(xPad);
        Spring yPadSpring = Spring.constant(yPad);
        Spring initialXSpring = Spring.constant(initialX);
        Spring initialYSpring = Spring.constant(initialY);
        int max = rows * cols;

        //Calculate Springs that are the max of the width/height so that all
        //cells have the same size.
        Spring maxWidthSpring = layout.getConstraints(parent.getComponent(0)).
                getWidth();
        Spring maxHeightSpring = layout.getConstraints(parent.getComponent(0)).
                getHeight();
        for (int i = 1; i < max; i++) {
            SpringLayout.Constraints cons = layout.getConstraints(
                    parent.getComponent(i));

            maxWidthSpring = Spring.max(maxWidthSpring, cons.getWidth());
            maxHeightSpring = Spring.max(maxHeightSpring, cons.getHeight());
        }

        //Apply the new width/height Spring. This forces all the
        //components to have the same size.
        for (int i = 0; i < max; i++) {
            SpringLayout.Constraints cons = layout.getConstraints(
                    parent.getComponent(i));

            cons.setWidth(maxWidthSpring);
            cons.setHeight(maxHeightSpring);
        }

        //Then adjust the x/y constraints of all the cells so that they
        //are aligned in a grid.
        SpringLayout.Constraints lastCons = null;
        SpringLayout.Constraints lastRowCons = null;
        for (int i = 0; i < max; i++) {
            SpringLayout.Constraints cons = layout.getConstraints(
                    parent.getComponent(i));
            if (i % cols == 0) { //start of new row
                lastRowCons = lastCons;
                cons.setX(initialXSpring);
            } else { //x position depends on previous component
                cons.setX(Spring.sum(lastCons.getConstraint(SpringLayout.EAST),
                        xPadSpring));
            }

            if (i / cols == 0) { //first row
                cons.setY(initialYSpring);
            } else { //y position depends on previous row
                cons.setY(Spring.sum(lastRowCons.getConstraint(SpringLayout.SOUTH),
                        yPadSpring));
            }
            lastCons = cons;
        }

        //Set the parent's size.
        SpringLayout.Constraints pCons = layout.getConstraints(parent);
        pCons.setConstraint(SpringLayout.SOUTH,
                Spring.sum(
                        Spring.constant(yPad),
                        lastCons.getConstraint(SpringLayout.SOUTH)));
        pCons.setConstraint(SpringLayout.EAST,
                Spring.sum(
                        Spring.constant(xPad),
                        lastCons.getConstraint(SpringLayout.EAST)));
    }

    /* Used by makeCompactGrid. */
    private static SpringLayout.Constraints getConstraintsForCell(
            int row, int col,
            Container parent,
            int cols) {
        SpringLayout layout = (SpringLayout) parent.getLayout();
        Component c = parent.getComponent(row * cols + col);
        return layout.getConstraints(c);
    }

    /**
     * Aligns the first <code>rows</code> * <code>cols</code>
     * components of <code>parent</code> in
     * a grid. Each component in a column is as wide as the maximum
     * preferred width of the components in that column;
     * height is similarly determined for each row.
     * The parent is made just big enough to fit them all.
     *
     * @param rows     number of rows
     * @param cols     number of columns
     * @param initialX x location to start the grid at
     * @param initialY y location to start the grid at
     * @param xPad     x padding between cells
     * @param yPad     y padding between cells
     */
    public static void makeCompactGrid(Container parent,
                                       int rows, int cols,
                                       int initialX, int initialY,
                                       int xPad, int yPad) {
        SpringLayout layout;
        try {
            layout = (SpringLayout) parent.getLayout();
        } catch (ClassCastException exc) {
            System.err.println("The first argument to makeCompactGrid must use SpringLayout.");
            return;
        }

        //Align all cells in each column and make them the same width.
        Spring x = Spring.constant(initialX);
        for (int c = 0; c < cols; c++) {
            Spring width = Spring.constant(0);
            for (int r = 0; r < rows; r++) {
                width = Spring.max(width,
                        getConstraintsForCell(r, c, parent, cols).
                                getWidth());
            }
            for (int r = 0; r < rows; r++) {
                SpringLayout.Constraints constraints =
                        getConstraintsForCell(r, c, parent, cols);
                constraints.setX(x);
                constraints.setWidth(width);
            }
            x = Spring.sum(x, Spring.sum(width, Spring.constant(xPad)));
        }

        //Align all cells in each row and make them the same height.
        Spring y = Spring.constant(initialY);
        for (int r = 0; r < rows; r++) {
            Spring height = Spring.constant(0);
            for (int c = 0; c < cols; c++) {
                height = Spring.max(height,
                        getConstraintsForCell(r, c, parent, cols).
                                getHeight());
            }
            for (int c = 0; c < cols; c++) {
                SpringLayout.Constraints constraints =
                        getConstraintsForCell(r, c, parent, cols);
                constraints.setY(y);
                constraints.setHeight(height);
            }
            y = Spring.sum(y, Spring.sum(height, Spring.constant(yPad)));
        }

        //Set the parent's size.
        SpringLayout.Constraints pCons = layout.getConstraints(parent);
        pCons.setConstraint(SpringLayout.SOUTH, y);
        pCons.setConstraint(SpringLayout.EAST, x);
    }
}
