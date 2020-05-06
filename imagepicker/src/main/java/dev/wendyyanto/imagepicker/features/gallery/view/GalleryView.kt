package dev.wendyyanto.imagepicker.features.gallery.view

import dev.wendyyanto.imagepicker.features.gallery.model.ImageGalleryUiModel

interface GalleryView {
    fun showImages(images: Map<String, List<ImageGalleryUiModel>>)
}