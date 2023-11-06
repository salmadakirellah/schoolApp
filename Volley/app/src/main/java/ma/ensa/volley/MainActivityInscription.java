package ma.ensa.volley;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityInscription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_inscription);

        // Références aux boutons
        Button gestionEtudiantButton = findViewById(R.id.gestionEtudiantButton);
        Button gestionFiliereButton = findViewById(R.id.gestionFiliereButton);

        // Définir des actions pour les boutons
        gestionEtudiantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Naviguer vers l'activité de gestion des étudiants
                Intent intent = new Intent(MainActivityInscription.this, MainActivityEtud.class);
                startActivity(intent);
            }
        });

        gestionFiliereButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Naviguer vers l'activité de gestion des filières
                Intent intent = new Intent(MainActivityInscription.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
