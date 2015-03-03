/*
Copyright (c) 2014, Mesmotronic Limited
All rights reserved.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

* Redistributions of source code must retain the above copyright notice, this
  list of conditions and the following disclaimer.

* Redistributions in binary form must reproduce the above copyright notice, this
  list of conditions and the following disclaimer in the documentation and/or
  other materials provided with the distribution.
	
* Neither the name of the {organization} nor the names of its
  contributors may be used to endorse or promote products derived from
  this software without specific prior written permission.
	
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR
ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
  LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package com.mesmotronic.ane.fullscreen;

import java.util.HashMap;
import java.util.Map;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.mesmotronic.ane.fullscreen.functions.ImmersiveHeightFunction;
import com.mesmotronic.ane.fullscreen.functions.ImmersiveModeFunction;
import com.mesmotronic.ane.fullscreen.functions.HideSystemUiFunction;
import com.mesmotronic.ane.fullscreen.functions.ImmersiveWidthFunction;
import com.mesmotronic.ane.fullscreen.functions.IsImmersiveModeSupportedFunction;
import com.mesmotronic.ane.fullscreen.functions.ShowSystemUiFunction;
import com.mesmotronic.ane.fullscreen.functions.ShowUnderSystemUiFunction;

public class FullScreenContext extends FREContext 
{
	@Override
	public void dispose() 
	{
		// Not required
	}
	
	@Override
	public Map<String, FREFunction> getFunctions() 
	{
		Map<String, FREFunction> functions = new HashMap<String, FREFunction>();
		
		functions.put("hideSystemUI", new HideSystemUiFunction());
		functions.put("immersiveMode", new ImmersiveModeFunction());
		functions.put("immersiveHeight", new ImmersiveHeightFunction());
		functions.put("immersiveWidth", new ImmersiveWidthFunction());
		functions.put("isImmersiveModeSupported", new IsImmersiveModeSupportedFunction());
		functions.put("showSystemUI", new ShowSystemUiFunction());
		functions.put("showUnderSystemUI", new ShowUnderSystemUiFunction());
		
		return functions;
	}
}