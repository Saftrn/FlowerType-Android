package ca.sa.poe.flowertype;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewFlowersAdapter extends RecyclerView.Adapter<CardViewFlowersAdapter.CardViewViewHolder> {
    private Context context;
    private ArrayList<Flowers> listFlowers;

    public ArrayList<Flowers> getListFlowers() {
        return listFlowers;
    }

    public void setListFlowers(ArrayList<Flowers> listFlowers) {
        this.listFlowers = listFlowers;
    }

    public CardViewFlowersAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_flowers, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder cardViewViewHolder, int i) {
        Flowers flowers = getListFlowers().get(i);

        Glide.with(context)
                .load(flowers.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(cardViewViewHolder.imgPhoto);

        cardViewViewHolder.tvName.setText(flowers.getName());
        cardViewViewHolder.tvGenus.setText(flowers.getGenus());

        cardViewViewHolder.btnFavorite.setOnClickListener(new CustomOnItemClickedListener(i, new CustomOnItemClickedListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int j) {
                Toast.makeText(context, "Favorite "+getListFlowers().get(j).getName(), Toast.LENGTH_SHORT).show();
            }
        }));

        cardViewViewHolder.btnShare.setOnClickListener(new CustomOnItemClickedListener(i, new CustomOnItemClickedListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int k) {
                Toast.makeText(context, "Share "+getListFlowers().get(k).getName(), Toast.LENGTH_SHORT).show();
            }
        }));

    }

    @Override
    public int getItemCount() {
        return getListFlowers().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvGenus;
        Button btnFavorite, btnShare;

        public CardViewViewHolder(View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvGenus = itemView.findViewById(R.id.tv_item_genus);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);

        }
    }
}
