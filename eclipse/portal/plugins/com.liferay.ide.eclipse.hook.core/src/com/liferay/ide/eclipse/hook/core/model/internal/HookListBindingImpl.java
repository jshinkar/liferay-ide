/*******************************************************************************
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * Contributors:
 * 		Gregory Amerson - initial implementation and ongoing maintenance
 *******************************************************************************/
package com.liferay.ide.eclipse.hook.core.model.internal;

import com.liferay.ide.eclipse.hook.core.model.IHook;

import org.eclipse.core.resources.IProject;
import org.eclipse.sapphire.modeling.LayeredListBindingImpl;

/**
 * @author Gregory Amerson
 */
public abstract class HookListBindingImpl extends LayeredListBindingImpl
{
	protected IHook hook()
	{
		return this.element().nearest( IHook.class );
	}

	protected IProject project()
	{
		return this.hook().adapt( IProject.class );
	}
}
