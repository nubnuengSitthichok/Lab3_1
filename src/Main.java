import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
//        String input = JOptionPane.showInputDialog("ใส่เลข 1 ตัว", "0");
//        JOptionPane.showMessageDialog(null,input,"title", JOptionPane.INFORMATION_MESSAGE);
        int ans = JOptionPane.showConfirmDialog(null,
                "ไปดูหนังกันเถอะ",
                "ถาม", JOptionPane.YES_NO_OPTION);
        if(ans == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null,"ไปสิ ๆ");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"เหอะไม่ไปอ่ะ");
        }
    }

}
