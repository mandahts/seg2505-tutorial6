package ca.uottawa.seg2505.recyclerviewtutorial;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Représente un élément visuel du RecyclerView.
 * Conserve les références au titre et à la description.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {

    public final TextView itemText;
    public final TextView itemDescription;

    /**
     * Initialise le ViewHolder à partir de la vue d'un élément.
     *
     * @param itemView Vue représentant un élément de la liste.
     */
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        itemText = itemView.findViewById(R.id.itemText);
        itemDescription = itemView.findViewById(R.id.itemDescription);
    }
}