package ca.uottawa.seg2505.recyclerviewtutorial;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Représente un élément visuel du RecyclerView.
 * Conserve la référence au TextView de chaque élément.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {

    public final TextView itemText;

    /**
     * Initialise le ViewHolder à partir de la vue d'un élément.
     *
     * @param itemView Vue représentant un élément de la liste.
     */
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        itemText = itemView.findViewById(R.id.itemText);
    }
}