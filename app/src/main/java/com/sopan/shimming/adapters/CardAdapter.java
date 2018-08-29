package com.sopan.shimming.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.sopan.shimming.models.ItemCard;
import com.sopan.shimming.utils.BaseUtils;
import com.sopan.shimming.viewholders.ItemHolder;

import java.util.ArrayList;
import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<ItemHolder> {

    private List<ItemCard> mCards = new ArrayList<>();
    private int mType = BaseUtils.TYPE_LIST;

    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return ItemHolder.newInstance(parent, mType);
    }

    @Override
    public void onBindViewHolder(ItemHolder holder, int position) {
        holder.bind(mCards.get(position));
    }

    @Override
    public int getItemCount() {
        return mCards.size();
    }

    public void setCards(List<ItemCard> cards) {
        if (cards == null) {
            return;
        }

        mCards = cards;
    }

    public void setType(int type) {
        this.mType = type;
    }
}
