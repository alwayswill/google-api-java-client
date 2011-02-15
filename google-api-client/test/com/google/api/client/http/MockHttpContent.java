/*
 * Copyright (c) 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.api.client.http;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Mock for {@link HttpContent}.
 * 
 * @author Yaniv Inbar
 */
public class MockHttpContent implements HttpContent {

  public String encoding;
  
  public long length = -1;

  public String type;
  
  public byte[] content = "".getBytes();
  
  public String getEncoding() {
    return encoding;
  }

  public long getLength() {
    return length;
  }

  public String getType() {
    return type;
  }

  public void writeTo(OutputStream out) throws IOException {
    out.write(content);
  }
}
