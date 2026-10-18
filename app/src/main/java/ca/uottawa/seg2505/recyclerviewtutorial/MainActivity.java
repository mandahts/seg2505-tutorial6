package ca.uottawa.seg2505.recyclerviewtutorial;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Activité principale affichant une liste dynamique
 * à l'aide d'un RecyclerView.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Initialise l'activité et configure le RecyclerView.
     *
     * @param savedInstanceState État précédent de l'activité.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // Définit une disposition verticale pour les éléments.
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Prépare les données à afficher.
        List<String> items = new ArrayList<>();

        for (int i = 1; i <= 30; i++) {
            items.add("Élément " + i);
        }

        // Associe les données au RecyclerView.
        MyAdapter adapter = new MyAdapter(items);
        recyclerView.setAdapter(adapter);
    }
}