/*
 * Copyright 2012-2014 Sergey Ignatov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.intellij.erlang.resolve;

import org.intellij.erlang.utils.ErlangLightPlatformCodeInsightFixtureTestCase;

public class ErlangMacroParameterResolutionTest extends ErlangLightPlatformCodeInsightFixtureTestCase {
  @Override
  protected String getTestDataPath() {
    return "testData/resolve/macroParameters/";
  }

  public void testSimple()      { doTest(); }
  public void testSecondUsage() { doTest(); }
  public void testAssignment()  { doTest(); }

  private void doTest() {
    myFixture.configureByFile(getTestName(true) + ".erl");
    myFixture.performEditorAction("GotoDeclaration");
    myFixture.checkResultByFile(getTestName(true) + "-after.erl");
  }
}
