import javax.swing.JOptionPane;
public class Burmashare {
public static void main(String[]args) {
String[] slogan = {
"shaving brushes",
"you'll soon see"em",
"On a shelf",
"In some museum"
};
for (String line : slogan) {
JOptionPane.showMessageDialog(null, line);
}
JOptionPane.showMessageDialog(null, "Burma Shave");
}
}
