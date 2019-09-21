package com.example.examen
import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class SectionsPagerAdapter (private val context: Context, fm: FragmentManager):
FragmentPagerAdapter(fm){
    private val TAB_TITLES = arrayOf(
        R.string.inicio_tab,
        R.string.nosotros_tab,
        R.string.contacto_tab,
        R.string.sesion_tab
    )

    override fun getItem(position: Int): Fragment? {
        when (position){
            0-> return InicioFragment()
            1-> return  NosotrosFragment()
            2-> return ContactoFragment()
            3-> return SesionFragment()
            else -> return null
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES [position])
    }

    override fun getCount(): Int {
        return TAB_TITLES.size
    }
}