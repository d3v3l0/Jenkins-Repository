/*
 * The MIT License
 *
 * Copyright (c) 2011, Nigel Magnay / NiRiMa
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.nirima.jenkins.repo.build;

import hudson.model.Run;
import com.nirima.jenkins.repo.RepositoryDirectory;
import com.nirima.jenkins.repo.RepositoryElement;

/**
 * Created by IntelliJ IDEA.
 * User: magnayn
 * Date: 25/02/2011
 * Time: 19:00
 * To change this template use File | Settings | File Templates.
 */
public class ArtifactRepositoryItem implements RepositoryElement {

    private Run.Artifact artifact;
    private RepositoryDirectory directory;

    public ArtifactRepositoryItem(RepositoryDirectory directory, Run.Artifact artifact)
    {
        this.artifact = artifact;
        this.directory = directory;
    }

    public String getName() {
        return artifact.getFileName();
    }

    public RepositoryDirectory getParent() {
        return directory;
    }

    public String getPath() {
        return directory.getPath() + "/" + getName();
    }
}
