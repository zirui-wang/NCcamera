package io.zirui.nccamera.view.image_gallery;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;

import butterknife.BindView;
import io.zirui.nccamera.R;
import io.zirui.nccamera.view.base.BaseViewHolder;


public class ImageViewHolder extends BaseViewHolder {

//    @BindView(R.id.shot_card_image) ImageView imageView;
    @BindView(R.id.shot_card_thumbnail) ImageView thumbnail;
    @BindView(R.id.shot_clickable_cover) View thumbnailButton;
    @BindView(R.id.expanded_image) ImageView expandedImageView;
    @BindView(R.id.zoom_container) FrameLayout container;

    public ImageViewHolder(View itemView) {
        super(itemView);
    }
}
