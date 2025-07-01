package com.example.stckhero;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.net.URL;

public class sound {
    private MediaPlayer backgroundMusic;
    private MediaPlayer cherrySound;
    private MediaPlayer stickDropSound;
    private MediaPlayer hitSound;
    private MediaPlayer walkSound;
    private MediaPlayer playerFallSound;
    private MediaPlayer playerHitSound;

    private boolean isMuted = false;
    private boolean isWalkSoundPlaying = false;
    private boolean isBackgroundMusicPlaying = false;

    public sound() {
        initializeSounds();
    }

    private void initializeSounds() {
        try {
            // Initialize all sound effects and background music
            URL backgroundMusicUrl = getClass().getResource("my-sensei-at-their-max-36914.mp3");
            if (backgroundMusicUrl != null) {
                backgroundMusic = new MediaPlayer(new Media(backgroundMusicUrl.toString()));
                backgroundMusic.setCycleCount(MediaPlayer.INDEFINITE); // Loop the background music
                backgroundMusic.setVolume(0.5); // 50% volume
            }

            URL cherrySoundUrl = getClass().getResource("cherry_sound.mp3");
            if (cherrySoundUrl != null) {
                cherrySound = new MediaPlayer(new Media(cherrySoundUrl.toString()));
            }

            URL stickDropSoundUrl = getClass().getResource("stick_drop.mp3");
            if (stickDropSoundUrl != null) {
                stickDropSound = new MediaPlayer(new Media(stickDropSoundUrl.toString()));
            }

            URL hitSoundUrl = getClass().getResource("hit_sound.mp3");
            if (hitSoundUrl != null) {
                hitSound = new MediaPlayer(new Media(hitSoundUrl.toString()));
            }

            URL walkSoundUrl = getClass().getResource("walk_sound.mp3");
            if (walkSoundUrl != null) {
                walkSound = new MediaPlayer(new Media(walkSoundUrl.toString()));
                walkSound.setCycleCount(MediaPlayer.INDEFINITE);
            }

            URL fallSoundUrl = getClass().getResource("fall_sound.mp3");
            if (fallSoundUrl != null) {
                playerFallSound = new MediaPlayer(new Media(fallSoundUrl.toString()));
            }

            URL playerHitSoundUrl = getClass().getResource("player_hit_sound.mp3");
            if (playerHitSoundUrl != null) {
                playerHitSound = new MediaPlayer(new Media(playerHitSoundUrl.toString()));
            }
        } catch (Exception e) {
            System.err.println("Error loading sounds: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Background music control
    public void playBackgroundMusic() {
        if (backgroundMusic != null && !isMuted) {
            backgroundMusic.play();
            isBackgroundMusicPlaying = true;
        }
    }

    public void stopBackgroundMusic() {
        if (backgroundMusic != null) {
            backgroundMusic.stop();
            isBackgroundMusicPlaying = false;
        }
    }

    public void pauseBackgroundMusic() {
        if (backgroundMusic != null) {
            backgroundMusic.pause();
        }
    }

    public boolean isBackgroundMusicPlaying() {
        return isBackgroundMusicPlaying;
    }

    public void setBackgroundVolume(double volume) {
        if (backgroundMusic != null) {
            backgroundMusic.setVolume(volume);
        }
    }

    // Cherry sound
    public void playCherrySound() {
        playSound(cherrySound);
    }

    // Stick drop sound
    public void playStickDropSound() {
        playSound(stickDropSound);
    }

    public void setStick_drop_sound(boolean play) {
        if (play) {
            playStickDropSound();
        } else if (stickDropSound != null) {
            stickDropSound.stop();
        }
    }

    // Hit sound
    public void playHitSound() {
        playSound(hitSound);
    }

    public void setHitSound(boolean play) {
        if (play) {
            playHitSound();
        } else if (hitSound != null) {
            hitSound.stop();
        }
    }

    // Walk sound
    public void playWalkSound() {
        if (walkSound != null && !isMuted) {
            walkSound.play();
            isWalkSoundPlaying = true;
        }
    }

    public void stopWalkSound() {
        if (walkSound != null) {
            walkSound.stop();
            isWalkSoundPlaying = false;
        }
    }

    public void setWalk_Sound(boolean play) {
        if (play) {
            playWalkSound();
        } else {
            stopWalkSound();
        }
    }

    public boolean getWalk_Sound() {
        return isWalkSoundPlaying;
    }

    // Player fall sound
    public void playPlayerFallSound() {
        playSound(playerFallSound);
    }

    public void setPlayerfall_sound(boolean play) {
        if (play) {
            playPlayerFallSound();
        } else if (playerFallSound != null) {
            playerFallSound.stop();
        }
    }

    // Player hit sound
    public void playPlayerHitSound() {
        playSound(playerHitSound);
    }

    public void setPlayer_hit_sound(boolean play) {
        if (play) {
            playPlayerHitSound();
        } else if (playerHitSound != null) {
            playerHitSound.stop();
        }
    }

    // Helper method to play a sound once
    private void playSound(MediaPlayer sound) {
        if (sound != null && !isMuted) {
            sound.seek(Duration.ZERO); // Reset to beginning
            sound.play();
        }
    }

    // Global sound control
    public void muteAll() {
        isMuted = true;
        if (backgroundMusic != null) backgroundMusic.setMute(true);
        if (cherrySound != null) cherrySound.setMute(true);
        if (stickDropSound != null) stickDropSound.setMute(true);
        if (hitSound != null) hitSound.setMute(true);
        if (walkSound != null) walkSound.setMute(true);
        if (playerFallSound != null) playerFallSound.setMute(true);
        if (playerHitSound != null) playerHitSound.setMute(true);
    }

    public void unmuteAll() {
        isMuted = false;
        if (backgroundMusic != null) backgroundMusic.setMute(false);
        if (cherrySound != null) cherrySound.setMute(false);
        if (stickDropSound != null) stickDropSound.setMute(false);
        if (hitSound != null) hitSound.setMute(false);
        if (walkSound != null) walkSound.setMute(false);
        if (playerFallSound != null) playerFallSound.setMute(false);
        if (playerHitSound != null) playerHitSound.setMute(false);

        // Resume playing background music if it was playing before
        if (isBackgroundMusicPlaying) {
            playBackgroundMusic();
        }
    }

    public boolean isMuted() {
        return isMuted;
    }

    public void toggleMute() {
        if (isMuted) {
            unmuteAll();
        } else {
            muteAll();
        }
    }

    // Stop all sounds (e.g., for game over or when switching screens)
    public void stopAllSounds() {
        stopBackgroundMusic();
        if (cherrySound != null) cherrySound.stop();
        if (stickDropSound != null) stickDropSound.stop();
        if (hitSound != null) hitSound.stop();
        if (walkSound != null) walkSound.stop();
        if (playerFallSound != null) playerFallSound.stop();
        if (playerHitSound != null) playerHitSound.stop();
    }
}
