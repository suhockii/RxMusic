package rx.music.ui.popular

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import rx.music.data.realm.models.User
import rx.music.net.models.Response

/** Created by Maksim Sukhotski on 5/1/2017. */
@StateStrategyType(AddToEndSingleStrategy::class)
interface RoomView : MvpView {
    fun showOnUserReceived(users: Response<List<User>>)
}