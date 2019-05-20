package ca.sa.poe.flowertype;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListFlowersAdapter extends RecyclerView.Adapter<ListFlowersAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<Flowers> listFlowers;

    public ListFlowersAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Flowers> getListFlowers() {
        return listFlowers;
    }

    public void setListFlowers(ArrayList<Flowers> listFlowers) {
        this.listFlowers = listFlowers;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_flowers, viewGroup, false);
        return new CategoryViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int i) {
        categoryViewHolder.tvName.setText(getListFlowers().get(i).getName());
        categoryViewHolder.tvGenus.setText(getListFlowers().get(i).getGenus());

        Glide.with(context)
                .load(getListFlowers().get(i).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListFlowers().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvGenus;
        ImageView imgPhoto;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvGenus = itemView.findViewById(R.id.tv_item_genus);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
