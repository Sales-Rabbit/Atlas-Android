package com.layer.atlas.util.itemanimators;

import androidx.recyclerview.widget.DefaultItemAnimator;

public class NoChangeAnimator extends DefaultItemAnimator {
    public NoChangeAnimator() {
        setSupportsChangeAnimations(false);
    }
}
