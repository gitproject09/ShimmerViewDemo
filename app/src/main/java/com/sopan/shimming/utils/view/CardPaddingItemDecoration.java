package com.sopan.shimming.utils.view;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;

public class CardPaddingItemDecoration extends RecyclerView.ItemDecoration {

    private int paddingBetweenItems;

    public CardPaddingItemDecoration(Context context) {
        this.paddingBetweenItems = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 8, context.getResources().getDisplayMetrics());
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.set(0, 0, 0, paddingBetweenItems);
    }
}
