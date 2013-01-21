module Handler.Power where

import Import
import Data.Aeson hiding(object)

data PowerResult = PowerResult { result :: Int }

instance ToJSON PowerResult where
	toJSON (PowerResult res) = object
		[ "result" .= res ]

power :: Int -> Int -> PowerResult
power base pow = PowerResult $ base ^ pow

getPowerR :: Int -> Int -> Handler RepJson
getPowerR base pow = do
	jsonToRepJson $ power base pow