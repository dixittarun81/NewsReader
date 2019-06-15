package com.tarun.newsreader.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import com.tarun.newsreader.Interface.itemClickListener;
import com.tarun.newsreader.Model.Articles;
import com.tarun.newsreader.Model.WebSite;
import com.tarun.newsreader.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

class ListSourceViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


    itemClickListener itemClickListener;
    TextView source_title;
    CircleImageView source_image;
    public ListSourceViewHolder(@NonNull View itemView) {
        super(itemView);
        source_image = (CircleImageView) itemView.findViewById(R.id.source_image);
        source_title = (TextView)itemView.findViewById(R.id.source_name);

    }

    public void setItemClickListener(com.tarun.newsreader.Interface.itemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),false);
    }
}


public class ListSourceAdapter extends RecyclerView.Adapter<ListSourceViewHolder> {
    private Context context;
    private WebSite webSite;
    private ArrayList<Articles> articles = new ArrayList<Articles>();


    public ListSourceAdapter(Context context, WebSite webSite) {
        this.context = context;
        this.webSite = webSite;
    }

    public ListSourceAdapter(ArrayList<Articles> articles) {
        this.articles = articles;
    }


    @NonNull
    @Override
    public ListSourceViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.source_layout,viewGroup,true);
        return new ListSourceViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ListSourceViewHolder listSourceViewHolder, int i) {
        String title = articles.get(i).getSource().getName();
        listSourceViewHolder.source_title.setText(title);
        listSourceViewHolder.setItemClickListener(new itemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                //
            }
        });

    }

    @Override
    public int getItemCount() {
        return articles.size();
    }
}
