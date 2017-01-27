package com.malpo.sliver.sample.ui.skeleton;

import dagger.Module;
import dagger.Provides;

@Module
public final class SkeletonModule {

    public SkeletonModule() {
    }

    @Provides
    @SkeletonScope
    SkeletonContract.Presenter providePresenter(SkeletonContract.Interactor interactor) {
        return new SkeletonPresenter(interactor);
    }

    @Provides
    @SkeletonScope
    SkeletonContract.Interactor provideInteractor() {
        return new SkeletonInteractor();
    }

    @Provides
    @SkeletonScope
    SkeletonContract.Router provideRouter() {
        return new SkeletonRouter();
    }

}
