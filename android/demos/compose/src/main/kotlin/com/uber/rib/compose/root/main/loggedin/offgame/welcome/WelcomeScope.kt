/*
 * Copyright (C) 2021. Uber Technologies
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.uber.rib.compose.root.main.loggedin.offgame.welcome

import android.view.ViewGroup
import com.uber.rib.compose.root.main.MainScope
import com.uber.rib.core.EmptyPresenter

@motif.Scope
interface WelcomeScope {
  fun router(): WelcomeRouter

  @motif.Objects
  abstract class Objects {
    abstract fun router(): WelcomeRouter

    abstract fun interactor(): WelcomeInteractor

    abstract fun presenter(): EmptyPresenter

    fun view(parentViewGroup: ViewGroup): WelcomeView {
      return WelcomeView(parentViewGroup.context)
    }
  }
}
