package com.sophie.simplelistener

class WaitAndUpdateTextView {

    private lateinit var listener: MyListener

    //class's function
    fun waitAndUpdate(newText: String) {
        //when completed, use the listener's function
        listener.postBack(newText)
    }

    //listener interface which has an unimplemented function I will create in my class
    interface MyListener {
        fun postBack(newText: String)
    }

    //set Listener, I make the listener from the function the same as the listener here, so they are connected and the function is implemented
    fun setListener(listener: MyListener) {
        this.listener = listener
    }
}