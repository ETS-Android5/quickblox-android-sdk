package com.quickblox.sample.conference.kotlin.presentation

/*
 * Created by Injoit in 2021-09-30.
 * Copyright © 2021 Quickblox. All rights reserved.
 */
interface SuccessResult<T> {
    fun onSuccess(result:T?)
}