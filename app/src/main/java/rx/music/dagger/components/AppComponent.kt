package rx.music.dagger.components

import dagger.Component
import io.realm.Realm
import me.base.MoxyController
import rx.music.dagger.modules.AppModule
import rx.music.dagger.modules.AuthModule
import rx.music.dagger.modules.UserModule
import rx.music.dagger.scopes.PerApp
import rx.music.data.mediaplayer.MediaPlayerRepositoryImpl
import rx.music.ui.main.MainPresenter

/** Created by Maksim Sukhotski on 4/7/2017. */
@PerApp @Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun plus(userModule: UserModule): UserComponent
    fun plus(authModule: AuthModule): AuthComponent

    fun inject(mainPresenter: MainPresenter)
    fun inject(mediaPlayerRepositoryImpl: MediaPlayerRepositoryImpl)
    fun inject(moxyController: MoxyController)

    fun realm(): Realm
}