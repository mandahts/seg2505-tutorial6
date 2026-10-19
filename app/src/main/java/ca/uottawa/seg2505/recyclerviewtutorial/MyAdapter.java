package ca.uottawa.seg2505.recyclerviewtutorial;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * Adaptateur permettant d'afficher une liste d'éléments
 * avec un titre et une description dans un RecyclerView.
 */
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private final List<String> items;

    /**
     * Initialise l'adaptateur avec les données à afficher.
     *
     * @param items Liste des éléments à afficher.
     */
    public MyAdapter(List<String> items) {
        this.items = items;
    }

    /**
     * Crée un ViewHolder pour un nouvel élément de la liste.
     *
     * @param parent Conteneur parent.
     * @param viewType Type de vue.
     * @return Nouveau ViewHolder.
     */
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);

        return new MyViewHolder(view);
    }

    /**
     * Associe le titre et la description à un élément.
     *
     * @param holder ViewHolder à mettre à jour.
     * @param position Position de l'élément.
     */
    @Override
    public void onBindViewHolder(
            @NonNull MyViewHolder holder, int position) {

        holder.itemText.setText(items.get(position));

        holder.itemDescription.setText(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
        );
    }

    /**
     * Retourne le nombre d'éléments dans la liste.
     *
     * @return Nombre total d'éléments.
     */
    @Override
    public int getItemCount() {
        return items.size();
    }
}