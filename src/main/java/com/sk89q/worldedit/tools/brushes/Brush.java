// $Id$
/*
 * WorldEdit
 * Copyright (C) 2010, 2011 sk89q <http://www.sk89q.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

package com.sk89q.worldedit.tools.brushes;

import com.sk89q.minecraft.util.commands.CommandContext;
import com.sk89q.worldedit.*;
import com.sk89q.worldedit.patterns.Pattern;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Represents a brush.
 *
 * @author sk89q
 */
public abstract class Brush {
    private Set<Character> valueFlags;
    
    protected Brush(Character... valueFlags) {
        this.valueFlags = new HashSet<Character>(Arrays.asList(valueFlags));
    }
    /**
     * Build the object.
     * 
     * @param editSession
     * @param pos
     * @param mat
     * @param size
     * @throws MaxChangedBlocksException 
     */
    public abstract void build(EditSession editSession, Vector pos, Pattern mat, double size)
            throws MaxChangedBlocksException;

    public abstract void parseInput(CommandContext args, LocalPlayer player,
            LocalSession session, WorldEdit we) throws WorldEditException;

    public Set<Character> getValueFlags() {
        return valueFlags;
    }
}
