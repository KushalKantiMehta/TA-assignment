package kushal.kanti.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;


public class MainActivity extends AppCompatActivity {

    TextView workings_textview;
    TextView results_textview;
    String workings="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        workings_textview=findViewById(R.id.workings_textview);
        results_textview=findViewById(R.id.results_textview);
    }

    private void setWorkings(String givenworkings){
        workings=workings+givenworkings;
        workings_textview.setText(workings);
    }

    public void equalonclick(View view) {
        Double results =null;
        try {
           ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
           results = (double) engine.eval(workings);
        } catch (Exception e) {
            Toast.makeText(this,"Invalid Input",Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }

        if(results!=null){
            results_textview.setText(String.valueOf(results.doubleValue()));
        }
    }

    public void clearonClick(View view) {
        workings_textview.setText("");
        results_textview.setText("");
        workings="";
        leftbrackets=true;
    }

    boolean leftbrackets=true;

    public void bracketsonclick(View view) {
        if(leftbrackets){
            setWorkings("(");
            leftbrackets=false;
        }
        else{
            setWorkings(")");
        }
    }

    public void backspaceonclick(View view) {
        String workingstemp = (String) workings_textview.getText();
        if(workingstemp.isEmpty()){
            Toast.makeText(this,"Cannot delete more",Toast.LENGTH_LONG).show();
        }
        else{
           String temp = workingstemp.substring(0,workingstemp.length()-1);
           workings_textview.setText(temp);
        }
    }

    public void division_onclick(View view) {
        setWorkings("/");
    }

    public void sevenonclick(View view) {
        setWorkings("7");
    }

    public void eightonclick(View view) {
        setWorkings("8");
    }

    public void nineonclick(View view) {
        setWorkings("9");
    }

    public void multiplyonclick(View view) {
        setWorkings("*");
    }

    public void fouronclick(View view) {
        setWorkings("4");
    }

    public void fiveonclick(View view) {
        setWorkings("5");
    }

    public void subtractiononclick(View view) {
        setWorkings("-");
    }

    public void sixonclick(View view) {
        setWorkings("6");
    }

    public void oneonclick(View view) {
        setWorkings("1");
    }

    public void twoonclick(View view) {
        setWorkings("2");
    }

    public void threeonclick(View view) {
        setWorkings("3");
    }

    public void additiononclick(View view) {
        setWorkings("+");
    }

    public void doublezeroonclick(View view) {
        setWorkings("00");
    }

    public void zeroonclick(View view) {
        setWorkings("0");
    }

    public void decimalonclick(View view) {
        setWorkings(".");
    }


}