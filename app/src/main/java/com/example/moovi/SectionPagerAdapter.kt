package com.example.moovi

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.moovi.Fragment.Movie.MovieFragment
import com.example.moovi.Fragment.TvSeries.TvSeriesFragment

private val TAB_TITLES = arrayOf(
    R.string.movie, R.string.tvseries
)

class SectionPagerAdapter (private val context: Context, fm: FragmentManager):

    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
{


    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = MovieFragment()
            1 -> fragment = TvSeriesFragment()
        }
        return fragment as Fragment
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return 2
    }

}
