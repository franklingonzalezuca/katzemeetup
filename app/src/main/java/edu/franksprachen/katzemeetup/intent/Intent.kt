package edu.franksprachen.katzemeetup.intent

sealed class Intent {
    object GetCatEvent:Intent()
    object None:Intent()
}