package com.quickblox.sample.conference.kotlin.presentation.screens.settings.audio

import androidx.annotation.IntDef
import com.quickblox.sample.conference.kotlin.presentation.screens.settings.audio.ViewState.Companion.SHOW_LOGIN_SCREEN

/*
 * Created by Injoit in 2021-09-30.
 * Copyright © 2021 Quickblox. All rights reserved.
 */
@IntDef(SHOW_LOGIN_SCREEN)
annotation class ViewState {
    companion object {
        const val SHOW_LOGIN_SCREEN = 0
    }
}