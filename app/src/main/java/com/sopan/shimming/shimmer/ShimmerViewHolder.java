package com.sopan.shimming.shimmer;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.sopan.shimming.R;

import io.supercharge.shimmerlayout.ShimmerLayout;

public class ShimmerViewHolder extends RecyclerView.ViewHolder {

    private ShimmerLayout mShimmerLayout;

    public ShimmerViewHolder(LayoutInflater inflater, ViewGroup parent, int innerViewResId) {
        super(inflater.inflate(R.layout.viewholder_shimmer, parent, false));
        mShimmerLayout = (ShimmerLayout) itemView;

        inflater.inflate(innerViewResId, mShimmerLayout, true);
    }

    public void setShimmerAngle(int angle) {
        mShimmerLayout.setShimmerAngle(angle);
    }

    public void setShimmerColor(int color) {
        mShimmerLayout.setShimmerColor(color);
    }

    public void setShimmerViewHolderBackground(Drawable viewHolderBackground) {
        if (viewHolderBackground != null) {
            setBackground(viewHolderBackground);
        }
    }

    public void setShimmerAnimationDuration(int duration) {
        mShimmerLayout.setShimmerAnimationDuration(duration);
    }

    public void bind() {
        mShimmerLayout.startShimmerAnimation();
    }

    private void setBackground(Drawable background) {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.JELLY_BEAN) {
            mShimmerLayout.setBackground(background);
        } else {
            mShimmerLayout.setBackgroundDrawable(background);
        }
    }
}
