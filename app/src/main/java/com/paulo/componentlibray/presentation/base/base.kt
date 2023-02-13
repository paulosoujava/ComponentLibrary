package com.paulo.componentlibray.presentation.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


// ERROR SUCCESS LOADING WARNING

interface IEvent{
    object Loading : IEvent
    object Error : IEvent
    object Warning : IEvent
    object Success : IEvent
}

sealed interface IState<T> {
    var display: String?
    var success: T?
    var event: IEvent

    fun checkConnection(): Boolean {
        if(false){
            event = IEvent.Warning
            display = "OPs no has connection"
        }
        return false
    }
}

/*abstract class AState<T>() {
    abstract var display: String?
    abstract var success: T?
    abstract var event: IEvent

    fun checkConnection(): Boolean {
        if(false){
            event = IEvent.Warning
            display = "OPs no has connection"
        }
        return false
    }
}*/

data class Person(val name: String)

data  class UIStateHome(
    override var display: String? = null,
    override var success: List<Person>? = null,
    override var event: IEvent = IEvent.Loading
):IState<List<Person>>


class MyViewModel: ViewModel(){

    private val _state = MutableStateFlow(UIStateHome())
    val state: StateFlow<UIStateHome> = _state.asStateFlow()

    init {
        state.value.checkConnection()
    }


    fun loading() {
        update(IEvent.Loading )
    }
    fun warning() {
        update(IEvent.Warning, message = "Ops voce esta sem conexao com a internet")
    }
    fun error() {
        update(event = IEvent.Error, message = "Ops um erro ocorreu aqui")
    }

    fun success() {
        update(event = IEvent.Success,success = listOf(Person("PAULO")) )
    }

    private fun update(event: IEvent, success: List<Person>?=null, message: String?=null){
        _state.update {
            it.copy(
                event=event,
                success = success,
                display = message
            )
        }
    }


}





















