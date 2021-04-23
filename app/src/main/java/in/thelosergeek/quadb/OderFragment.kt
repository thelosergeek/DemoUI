package `in`.thelosergeek.quadb

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class OderFragment : Fragment() {


    lateinit var location:ImageView
    lateinit var locationChange: TextView
    lateinit var panCake: ImageView
    lateinit var italianThurdays:ImageView
    lateinit var hariOmRestaurant: ImageView
    lateinit var healthy: ImageView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        // Inflate the layout for this fragment
        inflater.inflate(R.layout.fragment_oder, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        location = view.findViewById(R.id.location)
        location.setOnClickListener {

            Toast.makeText(activity,"Location button Clicked",Toast.LENGTH_SHORT).show()

        }
        locationChange = view.findViewById(R.id.locationChange)
        locationChange.setOnClickListener {

            Toast.makeText(activity,"Location Change button Clicked",Toast.LENGTH_SHORT).show()

        }
        panCake = view.findViewById(R.id.pancake)
        panCake.setOnClickListener {

            Toast.makeText(activity,"PanCake  Clicked",Toast.LENGTH_SHORT).show()

        }
        italianThurdays = view.findViewById(R.id.italianThursdays)
        italianThurdays.setOnClickListener {

            Toast.makeText(activity,"Italian Thursday button Clicked",Toast.LENGTH_SHORT).show()

        }
        hariOmRestaurant = view.findViewById(R.id.HariOmRestaurant)
        hariOmRestaurant.setOnClickListener {

            Toast.makeText(activity,"Restaurant Clicked",Toast.LENGTH_SHORT).show()

        }
        healthy = view.findViewById(R.id.Healthy)
        healthy.setOnClickListener {

            Toast.makeText(activity,"Cuisine Clicked",Toast.LENGTH_SHORT).show()

        }
    }
}