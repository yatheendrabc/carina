/*******************************************************************************
 * Copyright 2013-2018 QaProSoft (http://www.qaprosoft.com).
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
 *******************************************************************************/
package com.qaprosoft.carina.core.foundation.utils.naming;

import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class ClassMethodNameStategy implements INamingStrategy
{
	@Override
	public String getCanonicalTestName(ITestResult result)
	{
		String clazz = result.getMethod().getRealClass().getSimpleName();
		String method = result.getMethod().getMethodName();
		return String.format("%s.%s", clazz, method);
	}
	
	@Override
	public String getCanonicalTestMethodName(ITestResult result)
	{
		return result.getMethod().getMethodName();
	}

	@Override
	public String getPackageName(ITestResult result)
	{
		return result.getMethod().getRealClass().getPackage().getName();
	}

	@Override
	public String appendTestMethodName(String testName, ITestNGMethod m)
	{
		// do nothing additional
		return testName;
	}
}
