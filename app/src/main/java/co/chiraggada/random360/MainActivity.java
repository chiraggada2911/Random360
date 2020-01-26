package co.chiraggada.random360;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    //UI
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationSelectedListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Toast.makeText(MainActivity.this, "home", Toast.LENGTH_SHORT).show();
//                    HomeFragment homeFragment = new HomeFragment();
                    if (getSupportFragmentManager().getBackStackEntryCount() > 1) {
                        getSupportFragmentManager().popBackStack();
                    }
//                    openFragment(homeFragment, "Home fragment");
                    return true;
                case R.id.navigation_notification:
                    Toast.makeText(MainActivity.this, "Notifications", Toast.LENGTH_SHORT).show();
//                    DepartmentFragment departmentFragment = new DepartmentFragment();
                    if (getSupportFragmentManager().getBackStackEntryCount() > 1) {
                        getSupportFragmentManager().popBackStack();
                    }
//                    openFragment(departmentFragment, "Department fragment");

                    return true;
                case R.id.navigation_wishlist:
                    Toast.makeText(MainActivity.this, "wishlist", Toast.LENGTH_SHORT).show();
//                    WishlistFragment wishlistFragment = new WishlistFragment();
                    if (getSupportFragmentManager().getBackStackEntryCount() > 1) {
                        getSupportFragmentManager().popBackStack();
                    }
//                    openFragment(wishlistFragment, "Wishlist fragment");
                    return true;
                case R.id.navigation_profile:
                    Toast.makeText(MainActivity.this, "profile", Toast.LENGTH_SHORT).show();
//                    ProfileFragment profileFragment = new ProfileFragment();
                    if (getSupportFragmentManager().getBackStackEntryCount() > 1) {
                        getSupportFragmentManager().popBackStack();
                    }
//                    openFragment(profileFragment, "profile fragment");
                    return true;

            }
            return false;
        }
    };
}
