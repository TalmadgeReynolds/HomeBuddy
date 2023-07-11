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
package com.uber.rib.compose.root.main.loggedin.offgame

import android.view.ViewGroup
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import com.uber.rib.compose.R
import com.uber.rib.compose.root.main.loggedin.offgame.welcome.WelcomeRouter
import com.uber.rib.core.BasicComposeRouter
import com.uber.rib.core.ComposePresenter

class OffGameRouter(
  presenter: ComposePresenter,
  interactor: OffGameInteractor,
  slot: MutableState<(@Composable () -> Unit)>,
  private val scope: OffGameScope
) : BasicComposeRouter<OffGameInteractor>(presenter, interactor, slot) {

  private var welcomeRouter: WelcomeRouter? = null

  internal fun attachWelcome() {
    if (welcomeRouter == null) {
      // can't attach child because we have no ref to the FrameLayout from AndriodView in OffGameView
//      welcomeRouter = scope.welcomeScope().router().also {
//        attachChild(it)
//        view.findViewById<ViewGroup>(R.id.welcome_container).addView(it.view)
//      }
    }
  }
}
