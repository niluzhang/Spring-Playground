package com.huawei.nlz.springplayground.advancedbeanwiring.ambiguity.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cdPlayer")
public class CDPlayer implements MediaPlayer {
    @Autowired
    private CompactDisc cd;

    @Override
    public void play() {
        cd.play();
    }
}
