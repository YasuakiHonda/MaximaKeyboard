/*
 * Copyright (C) 2011 The Android Open Source Project
 * Copyright (C) 2019 Yasuaki Honda
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
 */

package jp.yhonda.MaximaKeyboard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.android.inputmethodcommon.InputMethodSettingsFragment;

/**
 * Displays About Maxima Keyboard in System's Ime Preference setting.
 */
public class ImePreferences extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // We overwrite the title of the activity, as the default one is "Voice Search".
        setTitle(jp.yhonda.MaximaKeyboard.R.string.settings_name);
        setContentView(R.layout.ime_preferences);
    }
}
