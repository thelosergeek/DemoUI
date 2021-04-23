package `in`.thelosergeek.quadb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val orderFragment= OderFragment()
        val goOderFragment = GoOutFragment()
        val proFragment=ProFragment()
        val nutritionFragment=NutritionFragment()
        val donateFragment=DonateFragment()

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.Order->setCurrentFragment(orderFragment)
                R.id.GoOut->setCurrentFragment(goOderFragment)
                R.id.Pro ->setCurrentFragment(proFragment)
                R.id.Nutrition ->setCurrentFragment(nutritionFragment)
                R.id.Donate ->setCurrentFragment(donateFragment)

            }
            true
        }




}

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }


}
