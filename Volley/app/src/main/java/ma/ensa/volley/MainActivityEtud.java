package ma.ensa.volley;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;

public class MainActivityEtud extends AppCompatActivity {
    private EditText nameEditText;
    private EditText phoneEditText;
    private EditText emailEditText;
    private Spinner filiereSpinner;
    RequestQueue requestQueue;
    String insertUrl = "http://localhost:8080/api/student";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_etud);
        nameEditText = findViewById(R.id.nameEditText);
        phoneEditText = findViewById(R.id.phoneEditText);
        emailEditText = findViewById(R.id.emailEditText);
        filiereSpinner = findViewById(R.id.filiereSpinner);
        String[] filieres = {"Informatique", "Électronique", "Mécanique"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, filieres);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        filiereSpinner.setAdapter(adapter);
    }

    public void saveEtudiant(View view) {
        // Récupérer les valeurs saisies par l'utilisateur
        String name = nameEditText.getText().toString();
        int phone = Integer.parseInt(phoneEditText.getText().toString());
        String email = emailEditText.getText().toString();
        String selectedFiliere = filiereSpinner.getSelectedItem().toString();

        // Créer un objet Etudiant avec les valeurs
        Etudiant etudiant = new Etudiant();
        etudiant.setName(name);
        etudiant.setPhone(phone);
        etudiant.setEmail(email);
        // Vous devrez également gérer la filière ici

        // Enregistrer l'étudiant ou effectuer d'autres opérations en conséquence
    }
}
