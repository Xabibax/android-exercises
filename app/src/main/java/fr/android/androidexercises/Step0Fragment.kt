package fr.android.androidexercises

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class Step0Fragment : Fragment() {

    companion object {
        private const val STEP_0 = "This is step 0"
    }

    private var textView: TextView? = null
    private var listener: OnNextStep0Listener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        // TODO cast context to listener
        listener = context as OnNextStep0Listener
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_step0, container, false)

        // TODO find TextView and set text
        textView = getView()?.findViewById<TextView>(R.id.textView)

        // TODO find Button and set listener
        val nextButton: Button? = getView()?.findViewById<Button>(R.id.nextButton)
        nextButton?.setOnClickListener {
            // TODO call listener
            listener?.onNext()
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO setText(STEP_0)
        textView?.text = STEP_0
    }

    interface OnNextStep0Listener {
        fun onNext() {

        }
    }// TODO add onNext() method

}
