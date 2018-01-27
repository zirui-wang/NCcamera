package io.zirui.nccamera.view;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;


import butterknife.BindView;
import butterknife.ButterKnife;
import io.zirui.nccamera.R;
import io.zirui.nccamera.camera.Camera;
import io.zirui.nccamera.view.image_gallery.ImageGalleryFragment;

public class MainActivity extends AppCompatActivity {

    public static final int SECTION_CURRENT = 0;
    public static final int SECTION_GALLERY = 1;

//    @BindView(R.id.view_pager_tab) TabLayout tabLayout;
    @BindView(R.id.fab) FloatingActionButton fab;
    @BindView(R.id.toolbar) Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.content, ImageGalleryFragment.newInstance())
                .commit();
//
//        setupViewPager();
//
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Camera.takePhoto(MainActivity.this);
            }
        });
    }

//    private void setupViewPager(){
//        viewPager.setAdapter(new SectionPagerAdapter(getSupportFragmentManager()));
//        tabLayout.setupWithViewPager(viewPager);
//
//        tabLayout.getTabAt(SECTION_CURRENT).setIcon(R.drawable.ic_camera_alt_white_24dp);
//        tabLayout.getTabAt(SECTION_GALLERY).setIcon(R.drawable.ic_favorite_white_24dp);
//
//        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//                if (position == SECTION_GALLERY){
//                    fab.hide();
//                }else{
//                    fab.show();
//                }
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//            }
//        });
//    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == Camera.REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
//            // add image to recyclerView
//            CameraPanelFragment cameraPanel_page = (CameraPanelFragment) getSupportFragmentManager().findFragmentByTag("android:switcher:" + R.id.content + ":" + SECTION_CURRENT);
//            cameraPanel_page.addShot();
//            // store image to disk
//            ImageGalleryFragment imageGallery_page = (ImageGalleryFragment) getSupportFragmentManager().findFragmentByTag("android:switcher:" + R.id.content + ":" + SECTION_GALLERY);
//            imageGallery_page.addShot();
//        }
//    }

//    private class SectionPagerAdapter extends FragmentPagerAdapter{
//
//        private SectionPagerAdapter(FragmentManager fm) {
//            super(fm);
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            Fragment fragment = null;
//            switch (position){
//                case SECTION_CURRENT:
//                    fragment = CameraPanelFragment.newInstance();
//                    break;
//                case SECTION_GALLERY:
//                    fragment = ImageGalleryFragment.newInstance();
//                    break;
//
//            }
//            return fragment;
//        }
//
//        @Override
//        public int getCount() {
//            return 2;
//        }
//
//        @Override
//        public CharSequence getPageTitle(int position) {
//            String title = null;
//            switch (position){
//                case SECTION_CURRENT:
//                    title = CameraPanelFragment.PAGE_TITLE;
//                    break;
//                case SECTION_GALLERY:
//                    title = ImageGalleryFragment.PAGE_TITLE;
//            }
//            return title;
//        }
//    }
}
