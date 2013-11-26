/*
 * Copyright 2012-2013 eBay Software Foundation and ios-driver committers
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.uiautomation.ios.inspector.model;

import org.json.JSONObject;
import org.uiautomation.ios.IOSCapabilities;
import org.uiautomation.ios.UIAModels.Orientation;
import org.uiautomation.ios.UIAModels.Session;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;

public interface IDESessionModel {

  public IOSCapabilities getCapabilities();

  public void refresh();

  public Session getSession();

  public InputStream getScreenshot() throws FileNotFoundException;

  public JSONObject getTree();

  public Orientation getDeviceOrientation();

  public URL getEndPoint();

  public JSONObject getStatus();
}