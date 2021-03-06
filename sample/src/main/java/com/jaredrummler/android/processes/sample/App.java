/*
 * Copyright (C) 2015. Jared Rummler <jared.rummler@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.jaredrummler.android.processes.sample;

import android.app.Application;

import com.jaredrummler.android.processes.ProcessManager;
import com.jaredrummler.android.processes.sample.picasso.AppIconRequestHandler;
import com.squareup.picasso.Picasso;

public class App extends Application {

  @Override public void onCreate() {
    super.onCreate();
    ProcessManager.setLoggingEnabled(true);
    Picasso.setSingletonInstance(new Picasso.Builder(this)
        .addRequestHandler(new AppIconRequestHandler(this))
        .build());
  }

}
