package gta.rfid_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AddInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_information);
    }

    public void saveInformationOnClick (View v){
        EditText nameET = (EditText)findViewById(R.id.nameEditText);
        EditText priceET = (EditText)findViewById(R.id.priceEditText);
        EditText notesET = (EditText)findViewById(R.id.notesEditText);
        TextView sampleTV = (TextView)findViewById(R.id.sampleTextView);

        String price = priceET.getText().toString();
        String name = nameET.getText().toString();
        String notes = notesET.getText().toString();

        // This will be where we actually save the input data later on. For now, simply reading and printing.
        if(price.isEmpty() || name.isEmpty() || notes.isEmpty())
        {
            sampleTV.setText("All fields.");
        }
        else
            sampleTV.setText(name + ", " + price + ", " + notes);

        // Save to DB file here
    }

    public void clearInformationOnClick (View v){
        EditText nameET = (EditText)findViewById(R.id.nameEditText);
        EditText priceET = (EditText)findViewById(R.id.priceEditText);
        EditText notesET = (EditText)findViewById(R.id.notesEditText);
        TextView sampleTV = (TextView)findViewById(R.id.sampleTextView);

        nameET.setText("");
        priceET.setText("");
        notesET.setText("");
        sampleTV.setText("Cleared");



    }
}
