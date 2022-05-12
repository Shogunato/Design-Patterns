import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import conversion.ConversionContext;
import conversion.expressions.*;

public class InterpreterMain {
    
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String questionAsked = JOptionPane.showInputDialog(frame, "What is your question?");
        ConversionContext question = new ConversionContext(questionAsked);
        
        String fromConversion = question.getFromConversion();
        String toConversion = question.getToConversion();

        double quantity = question.getQuantity();

        try{

            Class<?> tempClass = Class.forName("conversion.expressions."+fromConversion);
            Constructor<?> con = tempClass.getConstructor();
            Object converFrom = (AbstractExpression) con.newInstance();
            Class<?>[] methodParams = new Class[]{Double.TYPE};
            Method conversionMethod = tempClass.getMethod(toConversion, methodParams);
            Object[] params = new Object[]{quantity};
            String toQuantity = (String) conversionMethod.invoke(converFrom, params);
            
            String anwser = question.getConversionResponse()+toQuantity+" "+toConversion;
            JOptionPane.showMessageDialog(null, anwser);
            frame.dispose();

        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}
