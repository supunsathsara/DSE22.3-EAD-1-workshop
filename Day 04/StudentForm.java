import java.sql.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StudentForm extends JFrame {
    private JTextField fField;
    private JTextField lField;
    private JTextField bField;
    private JButton btnAdd;

    public StudentForm() {
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String firstname = fField.getText();
                String lastname = lField.getText();
                String birthdayStr = bField.getText();

                //convert birthday to date
                Date birthday = Date.valueOf(birthdayStr);

                Database db = new Database();
                db.add(firstname, lastname, birthday);

            }
        });
    }
}
