package com.muharram.criminalintent

import android.app.Dialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.TimePicker
import androidx.fragment.app.DialogFragment
import java.sql.Time
import java.text.DateFormat
import java.time.LocalTime
import java.util.*

private const val ARG_TIME = "time"

class TimePickerFragment:DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val calendar = Calendar.getInstance()
       // calendar.time=tim
        val intialHour = calendar.get(Calendar.HOUR_OF_DAY)
        val intialMinute = calendar.get(Calendar.MINUTE)


        return TimePickerDialog(
            requireContext(),
            null,
            intialHour,
            intialMinute,
            true
        )


          }

    companion object {
        fun newInstance(time: Time): TimePickerFragment {
            val args = Bundle().apply {
                putSerializable(ARG_TIME, time)            }
        return TimePickerFragment().apply {
            arguments = args
        }        }    }
}