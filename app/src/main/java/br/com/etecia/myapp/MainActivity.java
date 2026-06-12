package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Burguers> lstBurguer;
    RecyclerView idRecHamburguers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        idRecHamburguers = findViewById(R.id.idRecHamburguers);

        lstBurguer =  new ArrayList<>();

        lstBurguer.add(new Burguers("Brutão Na Chapa","Hambúrguer parrudo de 180g, cheddar derretido, bacon crocante," +
                " cebola na manteiga e molho defumado da casa. No pão brioche pra selar o crime","R$34,90",R.drawable.brutao));
        lstBurguer.add(new Burguers("Descarrego de Cheddar","Duplo smash burger com cheddar até escorrer, cebola caramelizada" +
                " e molho barbecue no pão australiano.","R$33,90",R.drawable.descarrego));

        AdapterBurguer adapterBurguer = new AdapterBurguer(getApplicationContext(),lstBurguer);

        idRecHamburguers.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        idRecHamburguers.setAdapter(adapterBurguer);

    }
}